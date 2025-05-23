<template>
  <hr/>

  <ul>
    <li v-for="(item, index) in news" :key="index">
     <span v-if="!item.wasRead">!!!</span> {{ item.title }}
    </li>
  </ul>
</template>

<script>
import {inject} from "vue";

export default {
  setup() {
    const news = inject('news');
    return {
      news,
    }
  },
}
</script>

<style scoped>

</style>