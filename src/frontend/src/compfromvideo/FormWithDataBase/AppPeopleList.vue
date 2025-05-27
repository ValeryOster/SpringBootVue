<template>
  <div v-if="people.length !== 0">
    <div class="card inline" v-for="person in people" :key="person.id">
      <h2>{{ person.name }}</h2>
      <p>Email: {{ person.email }}</p>
      <p>Phone: {{ person.phone }}</p>
      <hr>
      <button class="btn primary" @click="$emit('loadDetails')">Details</button>
      <button class="btn danger" @click="$emit('remove', person.id)">Löschen</button>
    </div>
  </div>
  <div class="card center" v-else>
    <h4>No people found.</h4>
    <button class="btn" @click="$emit('load')">Neu Laden</button>
  </div>
</template>

<script>
export default {
  emits: ['load','remove','loadDetails'],
  props: ['people'],
}

</script>

<style scoped>
.inline button{
  align-items: flex-end;
}
</style>