// import logo from './logo.svg';
import "./App.css";
// import { Demo } from "./component/Greed";
// import Ahmad from "./component/Greed";
import { Something } from "./component/Greed";

function App() {
  return (
    <div className="App">
      {/* hello world
      <Demo />
      <Khan /> */}
      <Something text="Click Me!" />
      <Something text='{{ Name: "Ishtehar khan" }}' />
    </div>
  );
}

export default App;
