<template>
  <div class="nav-container">
    <nav>
      <ul>
        <li><a href="#/test">Test</a></li>
        <li><a href="#/test2">Test2</a></li>
      </ul>
    </nav>
    <nav>
      <ul>
        <li><a href="#/test">Test</a></li>
        <li><a href="#/test2">Test2</a></li>
        <li><a href="#/test3">Test3</a></li>
        <li><a href="#/test4">Test4</a></li>
        <li><a href="#/test5">Test5</a></li>
        <input type="text" placeholder="Search...">
      </ul>
    </nav>

  </div>
</template>

<script>
</script>

<style scoped>
body {
  margin: 0;
  padding: 0;
}
.nav-container {
  display: flex;
  justify-content: space-between;
  background-color: #ebe8e8;
}
.nav-container>nav>ul {
  display: flex;
  list-style: none;
  align-items: center;
  margin: 0;
  padding: 0;
}
.nav-container>nav>ul>li>a {
  display: block;
  padding: 10px;
  border-style: solid;
  border-width: 0.5px;
}

@media (max-width: 700px) {
  .nav-container {
    flex-direction: column;
  }
}
</style>
