<template>
  <div class="container">
    <h3 @click="showAlert">{{ this.message }}</h3>

  </div>
</template>

<script>
export default {
  data() {
    return {
      message: 'Hello World',

    }
  },
  methods:{
    showAlert() {
      let title = 'Teil Drei'
      this.message = 'Dies ist der dritte Teil des Tutorials.' + title;
      title = "auch";
    },
    reactive(obj) {
      return new Proxy(obj, {});
    }
  },
  beforeCreate() {
    console.log('beforeCreate');
  },
  created() {
    console.log('created');
  },
  beforeMount() {
    console.log('beforeMount');
  },
  beforeUpdate() {
    console.log('beforeUpdate');
  },
  updated() {
    console.log('updated');
  },
  mounted() {
    console.log('mounted');
  },
  beforeUnmount() {
    console.log('unmounted');
  }


}

</script>

<style scoped>

</style>