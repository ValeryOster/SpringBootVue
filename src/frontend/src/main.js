
import './main.css';
import { createApp,} from 'vue'
import App from './App.vue'
import Myheader from './MyHeader.vue'

const app = createApp(App);

app.mount('#app');
app.component('My-header', Myheader);



// setTimeout(() => {
//     app.unmount();
// },
// 2000);