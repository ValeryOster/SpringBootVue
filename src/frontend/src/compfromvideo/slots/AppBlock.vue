<template>
  <div class="card">
    <slot name="header"></slot>
    <slot>kein Text</slot>
    <div v-if="$slots.footer">
      <slot name="footer"></slot>
    </div>
  </div>
</template>
<script>
export default {
  mounted() {
    console.log(this.$slots);
  }
}
</script>
<style scoped>

</style>