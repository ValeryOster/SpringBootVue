<template>
  <div class="container">

    <div class="col-md-4">
      <label :style="{color: inputVal.length < 5 ? 'darkred': 'darkgreen'}" class="form-label">Text</label>
      <input type="text" class="form-control"
             @placeholder="placeholder"
             v-model="inputVal"
             @keypress="inputKeyPressed"/>
    </div>
    <div class="col-12">
      <button class="btn btn-primary" type="submit" v-on:click="addToNoticeList">Zufügen</button>
    </div>
    <hr class="border-bottom border-1 border-dark">
    <div v-if="nodes.length > 0">
      <table class="table table-striped">
        <thead>
        <tr>
          <th scope="col">#</th>
          <th scope="col">Notizen</th>
        </tr>
        </thead>
        <tbody>
        <tr v-for="(node, index) in nodes" :key="index">
          <th scope="row">{{ index + 1 }}</th>
          <td>
            <div :class="node.length > 5 ? 'fw-bolder' : 'fw-bold'">
              {{ node }}
            </div>
            <div>
              <button type="button" class="btn btn-danger" v-on:click="removeItem">Löschen</button>
            </div>
          </td>
        </tr>
        </tbody>
      </table>
      <hr class="border-bottom border-1 border-dark">
      <div class="col-12">
        <strong>Gesamt Anzahl {{ nodes.length }}</strong>
      </div>
    </div>
    <div class="row" v-else>Es gibt kein Notizen</div>
  </div>

</template>

<script>
export default {
  data() {
    return {
      inputVal: '',
      placeholder: 'Type something...',
      nodes: ["Notize 1", "Notize 2", "Notize 3"]
    };
  },
  methods: {
    inputKeyPressed(event) {
      if (event.key === 'Enter') {
        this.addToNoticeList();
      }
    },
    addToNoticeList() {
      if (this.inputVal !== '') {
        this.nodes.push(this.inputVal);
        this.inputVal = '';
      }
    },
    removeItem(index) {
      this.nodes.splice(index, 1);
    },
  },
  computed: {
    getDobles() {
      return this.nodes.length * 2;
    }
  },
  watch: {
    nodes: {
      deep: true
    }
  }
}
</script>

<style scoped>
td {
  display: flex;
  justify-content: space-between;
}
</style>
