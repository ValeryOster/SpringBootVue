<template>
  <div class="container pt-1">
    <div class="card">
      <h2>Slots</h2>
    </div>
    <app-list>
      <template #default="{idx, iter}">
        <span style="color: #c25205">
          {{idx +1 }} :
          {{iter}}
        </span>
      </template>
    </app-list>

    <app-block>
      <template v-slot:header>
        <h2>Mein Titel</h2>
      </template>
      <template #default>
        <p>mein Text</p>
      </template>
      <template #footer>
        <hr/>
        <small>The Footer</small>
      </template>
    </app-block>
  </div>
</template>

<script>
import AppBlock from './AppBlock.vue'
import AppList from './AppList.vue'

export default {
  components: {AppBlock, AppList},
}
</script>

<style>
</style>
