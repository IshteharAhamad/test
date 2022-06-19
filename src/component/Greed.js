// import { render } from "@testing-library/react";
import React from "react";
// function Ahmad() {
//   return (
//     <div>
//       <h1>Ishtehar Ahmad</h1>
//     </div>
//   );
// }

// export default Ahmad;
// export const Demo = () => {
//   return (
//     <div>
//       <h1> Gyanish</h1>
//     </div>
//   );
// };
// next line code///
export function Something(prop) {
  const newthing = () => {
    alert("This is alert windows !!");
  };
  return (
    <div>
      <h1 onClick={newthing}>{prop.text}</h1>
      <h1 onClick={newthing}>{prop.text.Name}</h1>
    </div>
  );
}
