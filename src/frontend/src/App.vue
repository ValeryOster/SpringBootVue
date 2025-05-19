<template>
  <div class="container pt-1">
    <div class="card">
      <h2>Aktuelle Nachrichten heute {{ now }}</h2>
      <span>Gelesen <strong>{{openedRate}} | Angezeigt: {{showedRate}}</strong> </span>
    </div>
    <app-news v-for="item in news" :key="item.id" :title="item.title"
              :id="item.id" :open="item.open" :wasRead="item.wasRead"
              @open-news="openedRate++" @read-news="readNews" >
    ></app-news>
  </div>
</template>

<script>
import AppNews from "@/components/AppNews.vue";

export default {
  data() {
    return {
      openedRate: 0,
      showedRate: 0,
      now: new Date().toLocaleDateString(),
      news: [
        {
          title: 'Heute ist ein schöner Tag mit viel Sonne und wenig Wolken.',
          id: 1,
          open: false,
          wasRead: false,
        },
        {
          title: 'Die Temperaturen steigen auf bis zu 25 Grad.',
          id: 2,
          open: false,
          wasRead: false,
        },
        {
          title: 'Die Luftfeuchtigkeit ist angenehm und die Sonne scheint den ganzen Tag.',
          id: 3,
          open: false,
          wasRead: false,
        },
      ],
    }
  },
  methods: {
    readNews(id) {
      this.news.forEach((item) => {
        if (item.id === id) {
          this.showedRate++;
        }
      });
    }
  },
  components: {
    'app-news':AppNews,
  },
}
</script>

<style>

</style>
