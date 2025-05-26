<template>
  <div class="container">
    <form class="card" @submit.prevent="createPerson">
      <h2>DateBase anbinden</h2>
      <div class="form-control">
        <label for="name">Name</label>
        <input type="text" id="name" placeholder="Name" v-model="person.name" />
      </div>
      <button class="btn primary" :disabled="person.name.length === 0">Submit</button>
    </form>

  </div>
</template>
<script>

import axios from "axios";

export default {
  data() {
    return {
      persons: [],
      person:{
        id: null,
        name: '',
        email: '',
        phone: '',
      },
    }
  },
  methods: {
    async createPerson() {
      console.log(this.person);
      axios.post('http://localhost:8085/api/person/save', this.person).then(response => {
        console.log(response.data);
        this.persons.push(response.data);
      }).catch(error => {
        console.error("Error creating person:", error);
      })
    }
  },
}
</script>

<style>
</style>