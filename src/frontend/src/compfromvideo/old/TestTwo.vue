<script setup>

</script>

<template>
  <div>
    <div class="wrapper">
      <h1>Weather App</h1>
    </div>
    <div>
      <div class="img-container">
        <div>
          <img src="../../assets/bild/freshcreme.png" class="smetana">
          <img src="../../assets/bild/Smetana.png" class="cot">
        </div>
      </div>
      <p>
        Die Hypertext Markup Language (HTML, englisch für Hypertext-Auszeichnungssprache)
        ist eine textbasierte Auszeichnungssprache zur Strukturierung elektronischer Dokumente wie
        Texte mit Hyperlinks, Bildern und anderen Inhalten. HTML-Dokumente sind die Grundlage
        des World Wide Web und werden von Webbrowsern dargestellt. Neben den vom Browser angezeigten
        Inhalten können HTML-Dateien zusätzliche Angaben in Form von Metainformationen enthalten, z. B.
        über die im Text verwendeten Sprachen, den Autor oder den zusammengefassten Inhalt des Textes.

      </p>
      <div class="list">
        <p>HTML</p>
        <ol>
          <li><a href="">HTML ist eine Auszeichnungssprache</a></li>
          <li><a href="">HTML-Dokumente bestehen aus Elementen</a></li>
          <ol>
            <li><a href="">Ein Tag besteht aus einem öffnenden und einem schließenden Tag.</a></li>
            <li><a href="">HTML-Elemente können Attribute haben.</a></li>

          </ol>
          <li><a href="">HTML ermöglicht die Einbettung von Bildern.</a></li>
          <li><a href="">HTML ist die Grundlage für die meisten Webseiten.</a></li>
          <li><a href="">HTML kann mit CSS und JavaScript kombiniert werden</a></li>
        </ol>
      </div>

    </div>
  </div>
</template>

<style scoped>
.list {
  display: inline-block;
  border-style: solid;
  border-width: 0.5px;
  padding-right: 5px;
}

.list p {
  text-align: center;
  font-weight: bold;
}

.img-container {
  width: 300px;
  float: right;
  padding: 5px;
  border-style: solid;
  border-width: 0.5px;
  margin-left: 15px;
}
.img-container div {
  display: flex;
  align-items: center;
  flex-direction: column;
}
.smetana {
  max-width: 70px;
}
.cot {
  max-width: 300px;
}
</style>