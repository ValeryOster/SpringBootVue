<template>
  <div class="container pt-1">
    <div class="card">
      <h2>Dynamic and Async Componets</h2>
      <app-async-component></app-async-component>
    </div>

    <app-button
        ref="myBtn"
        :color="oneColor"
        @action="active = 'one'"
    >One
    </app-button>
    <app-button :color="twoColor"
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
import AppButton from "@/compfromvideo/ComponentComunication1/AppButton.vue";
import AppTextOne from "@/compfromvideo/DynamicAndAsyncComponents/AppTextOne.vue";
import AppTextTwo from "@/compfromvideo/DynamicAndAsyncComponents/AppTextTwo.vue";
import AppAsyncComponent from "@/compfromvideo/DynamicAndAsyncComponents/AppAsyncComponent.vue";

export default {
  data() {
    return {
      active: 'one' //two
    };
  },
  mounted() {
    console.log(this.$refs.myBtn.btn)
  },

  computed: {
    // componentName() {
    //   // if (this.active === 'one') {
    //   //   return 'app-text-one';
    //   // }
    //   // return 'app-text-two';
    //
    //   return 'app-text-' + this.active;
    // }
    componentName: {
      get() {
        return 'app-text-' + this.active;
      },
      set(values) {
        console.log(values)
      }
    },
    oneColor() {
      return this.active === 'one' ? 'primary' : '';
    }
    ,
    twoColor() {
      return this.active === 'two' ? 'primary' : '';
    }
  },
  components: {
    AppAsyncComponent,
    AppButton, AppTextOne, AppTextTwo
  }
}
</script>

<style>

</style>