<template>
  <div class="container pt-1">
    <div class="card">
      <h2>Dynamic and Async Componets</h2>
    </div>

    <app-button :color="active === 'one' ? 'primary' : ''"
                @action="active = 'one'"
    >One
    </app-button>
    <app-button :color="active === 'two' ? 'primary' : ''"
                @action="active = 'two'"
    >Two
    </app-button>
    <hr/>
    <keep-alive>
      <component :is="componentName"></component>
    </keep-alive>
  </div>
</template>

<script>
import AppButton from "@/components/AppButton.vue";
import AppTextOne from "@/components/AppTextOne.vue";
import AppTextTwo from "@/components/AppTextTwo.vue";

export default {
  data() {
    return {
      active: 'one' //two
    };
  },

  computed: {
    componentName() {
      // if (this.active === 'one') {
      //   return 'app-text-one';
      // }
      // return 'app-text-two';

      return 'app-text-' + this.active;
    }
  },
  components: {AppButton, AppTextOne, AppTextTwo}
}
</script>

<style>

</style>