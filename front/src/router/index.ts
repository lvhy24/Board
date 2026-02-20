import { createRouter, createWebHistory } from 'vue-router'
import DemoTactic from '../components/DemoTactic.vue'
import TacticBoard from '../components/TacticBoard.vue'
import Home from '../components/Home.vue'
import multimedia_analysis from '../components/multimedia_analysis.vue'

const routes = [
  //根路径，进入开始界面
  {path:'/',component:Home},
  // 模板战术库
  { path: '/demo', component: DemoTactic },
  //自定义战术库
  {path:'/self',component:TacticBoard},
  // 带参数路径：查看模板战术库中已有战术（:id 是占位符）
  { path: '/demo/tactic/:id', component: DemoTactic, props: true },
  // 带参数路径：查看/编辑自定义战术库中已有战术（:id 是占位符）
  { path: '/self/tactic/:id', component: TacticBoard, props: true },
  //视频分析
  {path:'/multimedia_analysis',component:multimedia_analysis},
  //临时路由
  {path:'/temp',component:TacticBoard}
]

const router = createRouter({
  history: createWebHistory(),  // 使用浏览器历史模式（无 # 号）
  routes
})

export default router