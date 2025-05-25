<template>
  <div class="form-control" :class="{invalid:error}">
    <label :for="id">{{ label }}</label>
    <input
        type="text"
        :id="id"
        :placeholder="placeholder"
        :value="modelValue"
        @input="change"
    >
    <small v-if="error">{{ error }}</small>
  </div>
</template>

<script>
export default {
  emits: ["update:modelValue"],
  props: {
    modelValue: String,
    placeholder: String,
    label: {
      type: String,
      required: true
    },
    error: {
      type: String,
      required: false,
    }
  },
  data() {
    return {
      id: 'input-' + Math.random(),
    }
  },
  methods: {
    change(event) {
      this.$emit('update:modelValue', event.target.value);
    }
  }
};

</script>

<style>

</style>