

<template>
  <div class="card" >
    <h3>{{ title }}</h3>
    <app-button  @action="toggleOpen" :text="this.isOpen ? 'Schließen' : 'Lesen'" ></app-button>
    <div v-if="isOpen">
      <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. At, excepturi?</p>
      <app-button
          v-if="!wasReaded"
          color="primary"
          @action="markMessage"
          text="Komplett gelesen">
        </app-button>
    </div>
  </div>
</template>

<script>
import AppButton from "@/components/AppButton.vue";
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
  components: {AppButton
  },
};
</script>

<style scoped>

</style>