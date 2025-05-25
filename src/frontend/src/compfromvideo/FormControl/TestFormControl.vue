<template>
  <div class="container">
    <form class="card" @submit.prevent="onsubmit()">
      <h1>Umfrage für Vue Softwareentwickler</h1>
      <app-input
          placeholder="Name"
          :error="errors.name"
          label="Name"
          v-model="name"
      ></app-input>
      <div class="form-control">
        <label for="age">Dein Alter</label>
        <input
            type="number"
            id="age"
            value="30"
            max="70"
            v-model.number="age"
        >
      </div>
      <div class="form-control">
        <label for="city">Deine Stadt</label>
        <select
            id="city"
            v-model="city"
        >
          <option value="Berlin">Berlin</option>
          <option value="Dortmund">Dortmund</option>
          <option value="Essen">Essen</option>
          <option value="Hamburg">Hamburg</option>
          <option value="München">München</option>
          <option value="Frankfurt">Frankfurt</option>
          <option value="Stuttgart">Stuttgart</option>
        </select>
      </div>
      <div class="form-checkbox">
        <span class="label">Bereit nach Tokio umziehen ?</span>
        <div class="checkbox">
          <label><input type="radio" v-model="relocate" name="trip" value="yes">Ja</label>
        </div>
        <div class="checkbox">
          <label><input type="radio" v-model="relocate" name="trip" value="no">Nein</label>
        </div>
      </div>
      <div class="form-checkbox">
        <span class="label">Was du in Vue kennst?</span>
        <div class="checkbox">
          <label><input type="checkbox" v-model="vueKnowledge" name="vueKnowledge" value="vuex">Vuex</label>
        </div>
        <div class="checkbox">
          <label><input type="checkbox" v-model="vueKnowledge" name="vueKnowledge" value="cli">Vue CLI</label>
        </div>
        <div class="checkbox">
          <label><input type="checkbox" v-model="vueKnowledge" name="vueKnowledge" value="router">Vue Router</label>
        </div>
      </div>
      <hr>
      <div class="form-checkbox">
        <label>Unsere Regel</label>
        <div class="checkbox">
          <label><input type="checkbox" v-model="agree">Regel annehmen</label>
        </div>
      </div>
      <button type="submit" class="btn primary" :disabled="!agree">Senden</button>
    </form>

  </div>
</template>
<script>
import AppInput from "@/compfromvideo/FormControl/AppInput.vue";

export default {
  data() {
    return {
      name: '',
      age: 30,
      city: 'Essen',
      relocate: 'Ja',
      vueKnowledge: [],
      agree: false,
      errors: {
        name: null,
      }
    }
  },
  methods: {
    formIsValid() {
      this.errors.name = null;
      if (this.name.length === 0) {
        this.errors.name = 'Name muss mindestens 1 Zeichen lang sein';
        return false;
      }
      return true;
    },
    onsubmit() {
      if(!this.formIsValid()) {
        console.log('Formular ist ungültig');
        return;
      }
      console.group('form submitted');
      console.log('Name:', this.name);
      console.log('Name:', this.age);
      console.log('Name:', this.city);
      console.log('Name:', this.relocate);
      console.log('Name:', this.vueKnowledge);
      console.log('Name:', this.agree);
      console.groupEnd()
      // Handle form submission logic here
    }
  },
  components: {AppInput},
}
</script>

<style>
.form-control  small{
  color: #e53935;
}
.form-control.invalid{
  border: 1px solid #e53935;
}
</style>