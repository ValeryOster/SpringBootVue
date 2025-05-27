<template>
  <div class="container">
    <app-alert
        :alert="alert"
        @close="alert = null"
    ></app-alert>
    <form class="card" @submit.prevent="createPerson">
      <h2>DateBase anbinden</h2>
      <div class="form-control">
        <label for="name">Name</label>
        <input type="text" id="name" placeholder="Name" v-model="person.name"/>
      </div>
      <button class="btn primary" :disabled="person.name.length === 0">Submit</button>
    </form>
    <app-loader v-if="loading"></app-loader>
    <app-people-list
        v-else
        :people="persons"
        @load="fetchPersons"
        @remove="removePersonFromList"
    ></app-people-list>
  </div>
</template>

<script>
import axios from "axios";
import AppPeopleList from "@/compfromvideo/FormWithDataBase/AppPeopleList.vue";
import AppAlert from "@/compfromvideo/FormWithDataBase/AppAlert.vue";
import AppLoader from "@/compfromvideo/FormWithDataBase/AppLoader.vue";

export default {
  data() {
    return {
      persons: [],
      person: {
        id: null,
        name: '',
        email: '',
        phone: '',
      },
      alert: null,
      loading: false,
    }
  },
  methods: {
    async createPerson() {
      axios.post('http://localhost:8085/api/person/save', this.person).then(response => {
        this.persons.push(response.data);
      }).catch(error => {
        console.error("Error creating person:", error);
      })
      this.fetchPersons();
    },
    async fetchPersons() {
      this.loading = true;
      try {
        const response = await axios.get('http://localhost:8085/api/person/all');
        this.persons = response.data;
      } catch (error) {
        this.alert = {
          type: 'error',
          title: 'Fehler',
          text: error.message,
        }
      }
      this.loading = false;
    },
    async removePersonFromList(id) {
      try {
        await axios.get(`http://localhost:8085/api/person/delete/${id}`);
        this.persons = this.persons.filter(person => person.id !== id);
        this.alert = {
          type: 'success',
          title: 'Success',
          text: 'Person ' + +' erfolgreich entfernt.',
        }
      } catch (error) {
        console.error("Error removing person:", error);
      }
    }
  },
  mounted() {
    this.fetchPersons();
  },
  components: {
    AppPeopleList, AppAlert, AppLoader
  },
}
</script>

<style>
</style>