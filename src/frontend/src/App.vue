<template>
  <div class="container">
    <app-alertvue
        v-if="alert"
        :text="'Dies ist eine Warnung!'"
        :title="'Achtung'"
        :closable="true"
        type="danger"
        @close="alert = false"
    ></app-alertvue>
    <div class="card">
      <button class="btn primary" @click="alert=true">Alle Nachrichten</button>
    </div>

  </div>
</template>

<script>
import AppAlertvue from "@/components/AppAlertvue.vue";

export default {
  data() {
    return {
      alert: false,
    }
  },
  components: {AppAlertvue},
  methods: {
    changeColor() {
      this.color = 'danger';
    },
  }
}
</script>

<style>

</style>