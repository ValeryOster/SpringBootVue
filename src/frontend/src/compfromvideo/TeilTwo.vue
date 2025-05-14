<template>
  <div class="container">
    <h3 v-text="this.title"></h3>
  </div>
  <div class="form-control">
    <label class="form-label">Vorname</label>
    <input type="text" class="form-control" ref="myInput"
           @placeholder="placeholder"
           @keyup.enter="this.addItems"/>
  </div>
  <ul v-if="items.length">
    <li v-for="(item, index) in items" :key="item"
        @click="this.items.splice(index, 1)">
      <strong>{{index}} - {{item.name}} </strong>
      <input type="text" @click.stop/>
    </li>
  </ul>
  <ul v-else>
    <li>Es gibt keine Einträge</li>
  </ul>
</template>

<script>

export default {
  data() {
    return{
      title:"Hallo",
      zahlen: [1, 2, 3, 4, 5],
      items: [
        { name: 'Max', age: 25 },
        { name: 'Moritz', age: 30 },
        { name: 'Miriam', age: 35 },
      ],

      person :{
        firstName: 'Max',
        lastName: 'Mustermann',
        age: 25,
        address: '127.0.0.1',
      }
    }
  },
  methods:{
    addItems() {
      console.log(this.$refs.myInput.value);
    },
  },
  computed: {
    eventItem() {
      return this.items.filter(item => item.age <= 30);
    },
  }
}
</script>

<style scoped>

</style>
