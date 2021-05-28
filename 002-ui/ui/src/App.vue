<template>
  <div id="app">
    <router-link to="/tbBook/selectAll">购物车</router-link> |
    <router-link to="/tbBook/index">首页</router-link>
    <keep-alive>
      <router-view></router-view>
    </keep-alive>
  </div>
</template>

<style>

</style>
<script>

  import Book from "@/components/Book";
  import Index from "@/components/Index";

  export default {
    name: 'app',
    components: {
      Book,
      Index
    }
  }
</script>