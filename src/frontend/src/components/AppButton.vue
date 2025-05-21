
<template>
  <button class="btn" :class='color' @click="$emit('action')">
    <slot></slot>
  </button>
</template>

<script>
export default{
  props:{
    text:String,
    color:{
      type:String,
      default:"",
      validator(value){
        return ["primary", "secondary", "success", "danger", "warning", "info", "light", "dark"].includes(value);
      }
    }
  },
  emits: ['action'],
}
</script>

<style scoped>

</style>