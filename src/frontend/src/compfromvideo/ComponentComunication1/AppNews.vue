

<template>
  <div class="card" >
    <h3>{{ title }}</h3>
    <app-button color="info" @action="toggleOpen">{{ this.isOpen ? 'Schließen' : 'Lesen' }} </app-button>
    <div v-if="isOpen">
      <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. At, excepturi?</p>
      <app-button
          v-if="!wasReaded"
          color="primary"
          @action="markMessage">Komplett gelesen</app-button>
    <app-news-list></app-news-list>
    </div>
  </div>
</template>

<script>
import AppButton from "@/compfromvideo/ComponentComunication1/AppButton.vue";
import AppNewsList from "@/compfromvideo/ComponentComunication1/AppNewsList.vue";

export default {
  props: {
    title: {
      type: String,
      required: true
    },
    id: {
      type: Number,
      required: true
    },
    open: {
      type: Boolean,
      required: false,
    },
    wasRead: {
      type: Boolean,
      required: false,
    }
  },
  emits: {
    'open-news': null,
    'read-news'(id) {
      if (id) {
        return true;
      }
      console.log("ID " + id + " not found");
      return false;
    },
  },
  data() {
    return {
      isOpen: this.open,
      wasReaded: this.wasRead,
    }
  },
  methods: {
    toggleOpen() {
      this.isOpen = !this.isOpen;
      if (this.isOpen) {
        this.$emit('open-news', this.id, this.isOpen);
      }
    },
    markMessage() {
      this.wasReaded = !this.wasReaded;
      this.$emit('read-news', this.id, this.wasReaded);
    }
  },
  components: {AppButton, AppNewsList},
};
</script>

<style scoped>

</style>