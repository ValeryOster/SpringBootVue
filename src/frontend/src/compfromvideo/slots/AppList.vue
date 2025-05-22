
<template>
  <div class="card">
    <ul>
      <li v-for="(item,index) in 5" :key="index">
        <slot :iter="item" :idx="index"></slot>
      </li>

    </ul>
  </div>
</template>

<script>

</script>

<style scoped>

</style>