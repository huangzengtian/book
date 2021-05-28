import Vue from 'vue'
import VueRouter from 'vue-router'

const Book = () => import('../components/Book')
const Index = () => import('../components/Index')


Vue.use(VueRouter)

const routes = [
  {
    path: '/',
    //redirect: '/tbBook/selectAll'
  },
  {
    path: '/tbBook/selectAll',
    component: Book,
    meta: {
      title: '购物车'
    }
  },
  {
    path: '/tbBook/index',
    component: Index,
    meta: {
      title: '首页'
    }
  }
]

const router = new VueRouter({
  mode: 'history',
  base: process.env.BASE_URL,
  routes
})

//生成页面标题
router.beforeEach((to, from, next) => {
  //从from跳转到to
  document.title = to.matched[0].meta.title
  next()
})


export default router
