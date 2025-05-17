<script setup>

</script>

<template>
  <div>
    <div class="outher">
      <div class="content">
        <img src="../assets/bild/Smetana.png">
        <p>First</p>
        <p>Second</p>
        <p>Third</p>
      </div>
      <div class="content">
        <img src="../assets/bild/Smetana.png">
        <p>First</p>
        <p>Second</p>
        <p>Third</p>
      </div>
      <div class="content">
        <img src="../assets/bild/Smetana.png">
        <p>First</p>
        <p>Second</p>
        <p>Third</p>
      </div>
    </div>

    <div class="outher">
      <div class="content">
        <img src="../assets/bild/Smetana.png">
        <p>First</p>
        <p>Second</p>
        <p>Third</p>
      </div>
      <div class="content">
        <img src="../assets/bild/Smetana.png">
        <p>First</p>
        <p>Second</p>
        <p>Third</p>
      </div>
      <div class="content">
        <img src="../assets/bild/Smetana.png">
        <p>First</p>
        <p>Second</p>
        <p>Third</p>
      </div>
    </div>
    <div class="container">
      <img src="../assets/bild/Smetana.png">
      <img src="../assets/bild/Smetana.png">
      <img src="../assets/bild/Smetana.png">
    </div>
  </div>
</template>

<style scoped>
.container {
  display: flex;
  flex-direction: row;
  justify-content: space-between;
  background-color: darkgrey;
}
p {
  font-size: 24px;
  background-color: rgba(171, 85, 85, 0.24);
}
.content {
  margin: 4px;
  display: inline-block;
  text-align: center;
  background-color: darkgrey;
}
.content>img {
  max-width: 300px;
}
</style>