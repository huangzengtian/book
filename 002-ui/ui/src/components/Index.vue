<template>
  <div>
    <label for="searchName">
      名称<input type="text" id="searchName" v-model.trim="searchName">&nbsp;
    </label>
    <label for="searchAuthor">
      作者<input type="text" id="searchAuthor" v-model.trim="searchAuthor">&nbsp;
    </label>
    <label>
      价格<input type="number" id="searchPriceLow" v-model.trim="searchPriceLow">
      - <input type="number" id="searchPriceHigh" v-model.trim="searchPriceHigh">&nbsp;
    </label>
    <button @click="searchBook">搜索</button>
    <button @click="searchBookWithPrice">包含价格区间的搜索</button>
    <br>
    <br>
    <table cellpadding="0" cellspacing="0" border="1px">
      <thead>
      <tr>
        <td>序号</td>
        <td>书名</td>
        <td>作者</td>
        <td>出版日期</td>
        <td>价格</td>
        <td>描述</td>
      </tr>
      </thead>
      <tbody v-for="(item, index) in books">
      <tr>
        <td>{{ index + 1 }}</td>
        <td>{{ item.name | nameType }}</td>
        <td>{{ item.author }}</td>
        <td>{{ item.publishDate | dateType }}</td>
        <td>{{ item.price | priceType }}</td>
        <td>{{ item.description }}</td>
      </tr>
      </tbody>
    </table>
  </div>
</template>

<script>
  import axios from "axios";
  import api from "@/config/api";
  import moment from "moment";

  export default {
    name: "Index",
    data() {
      return {
        books: [],
        searchName: "",
        searchAuthor: "",
        searchPriceLow: "",
        searchPriceHigh: ""
      }
    },
    methods: {
      searchBook() {
        let param = {
          name: this.searchName,
          author: this.searchAuthor,
          priceLow: this.searchPriceLow,
          priceHigh: this.searchPriceHigh
        };

        axios.post(api.GET_ALL_BOOK_BY_FUZZY, param).then(r => {
          this.books = r.data.data;
        })
      },
      searchBookWithPrice() {
        let param = {
          name: this.searchName,
          author: this.searchAuthor,
          priceLow: this.searchPriceLow === '' ? 0 : this.searchPriceLow,
          priceHigh: this.searchPriceHigh
        };

        axios.post(api.GET_BOOK_BY_FUZZY_AND_PRICE, param).then(r => {
          this.books = r.data.data;
        })
      }
    },
    filters: {
      nameType(name) {
        return "《" + name + "》";
      },
      dateType(date) {
        return moment(date).format('YYYY年MM月DD日');
      },
      priceType(price) {
        return "￥" + Number(price).toFixed(2);
      }
    },
    created() {
      console.log('Index实例被创建了。。。');
      let param = {
        name: '',
        author: ''
      }

      axios.post(
          api.GET_ALL_BOOK_BY_FUZZY,
          param
      ).then(r => {
        this.books = r.data.data;
      })
    },
    destroyed() {
      console.log('Index实例被销毁了。。。');
    }
  }
</script>

<style scoped>

</style>