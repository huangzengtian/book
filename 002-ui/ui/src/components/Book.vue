<template>
  <div>
    <div v-if="books.length>0">
      <table cellpadding="0" cellspacing="0" border="1px">
        <thead>
        <tr>
          <td>序号</td>
          <td>书名</td>
          <td>作者</td>
          <td>出版日期</td>
          <td>价格</td>
          <td>描述</td>
          <td>数量</td>
          <td>操作</td>
        </tr>
        </thead>
        <tbody v-for="(item, index) in books">
        <tr>
          <td>{{index+1}}</td>
          <td>{{item.name | nameType}}</td>
          <td>{{item.author}}</td>
          <td>{{item.publishDate | dateType}}</td>
          <td>{{item.price | priceType}}</td>
          <td>{{item.description}}</td>
          <td><button @click="decrement(index)" :disabled="books[index].num<=1">-</button>{{item.num}}<button @click="increment(index)">+</button></td>
          <td><button @click="delBook(index)">删除</button></td>
        </tr>
        </tbody>
      </table>
      <div>总价：{{getTotalPrice | priceType}}</div>
    </div>
    <div v-else>
      购物车还没有东西哦，快去添加吧！
    </div>
  </div>
</template>

<script>
  import axios from "axios";
  import api from "@/config/api";
  import moment from 'moment';

  export default {
    name: "Book",
    data() {
      return {
        books: [],
        count: 1
      }
    },
    methods: {
      delBook(index) {
        this.books.splice(index, 1);
      },
      decrement(index) {
        this.books[index].num--;
      },
      increment(index) {
        this.books[index].num++;
      }
    },
    computed: {
      getTotalPrice() {
        return this.books.reduce((sum, book) =>
         sum += (book.price * book.num)
        , 0)
      }
    },
    filters: {
      nameType(name) {
        return "《" + name + "》";
      },
      dateType(date) {
       return  moment(date).format('YYYY年MM月DD日');
      },
      priceType(price) {
        return "￥" + Number(price).toFixed(2);
      }
    },
    created() {
      console.log('Book实例创建了。。。');
      let that = this;
      axios.post(api.GET_ALL_BOOK_BY_FUZZY, {}).then(r => {
        that.books = r.data.data;

        //给数组里每个对象增加一个num属性(非响应式)
        // that.books = that.books.map((item, index) => {
        //     return  Object.assign(item, {'num': 1})
        // })

        //给数组里每个对象增加一个num属性（响应式）
        that.books.forEach(book => {
          this.$set(book, 'num', 1)
        })
      })
    },
    destroyed() {
      console.log('Book实例被销毁了');
    }
  }
</script>

<style scoped>

</style>