<template>
  <div class="alert" :class="type">
    <h3>{{ title }}</h3>
    <p>{{ text }}</p>
    <button class="btn" :class="type" v-if="closable" @click="$emit('close')">Close</button>
  </div>
</template>

<script>
export default {
  emits: ['close'],
  props: {
    text: String,
    title: String,
    closable: {
      type: Boolean,
      required: false,
      default: false
    },
    type: {
      type: String,
      required: false,
      default: 'primary',
      validator(value) {
        return ['primary', 'secondary', 'success', 'danger', 'warning', 'info', 'light', 'dark'].includes(value);
      }
    },
  }
}
</script>

<style scoped>

</style>