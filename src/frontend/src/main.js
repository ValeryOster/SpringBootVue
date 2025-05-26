import './main.css';
import { createApp} from 'vue'
import App from './App.vue'
import axios from 'axios'


let app = createApp(App);
app.mount('#app');

app.config.globalProperties.axios=axios


// setTimeout(() => {
//     app.unmount();
// },
// 2000);