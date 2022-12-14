// import ReactDOM from "react-dom";
// import { StrictMode } from "react";
// import{createRoot} from "react-dom/client"
// import { BrowserRouter, Routes, Route } from "react-router-dom";
// import Layout from "./pages/Layout";
// import Home from "./pages/Home";
// import Random from "./pages/Random";
// import Contact from "./pages/Contact";
// import NoPage from "./pages/NoPage";


// const rootElement = document.getElementById('root');
// const root = createRoot(rootElement);


// export default function NavigatorInitialiser() {
//   return (
//   <>
//     <BrowserRouter>
//       <Routes>
//         <Route path="/" element={<Layout />}>
//         <Route index element={<Home />} />
//         <Route path="random" element={<Random />} />
//         <Route path="contact" element={<Contact />} />
//         <Route path="*" element={<NoPage />} />
//         </Route>
//       </Routes>
//     </BrowserRouter>
//       <div>
//         hello
//       </div>
//   </>
//   )
// }



// root.render(
//   <div>
//   <h1>hi</h1>
//     <NavigatorInitialiser />
//   </div>
// );

import React, { useEffect, useRef, useState, useSyncExternalStore } from "react";
import{ createRoot } from "react-dom/client";
import "./index.css"

const rootElement = document.getElementById('root');
const root = createRoot(rootElement);

 function  Getallactors(){
  //funtionality below:

  const[actorname,setactorname] = useState([])

  useEffect(() =>{
    fetch("http://localhost:8080/home/allActors")
    .then(res => res.json())
    .then(actor =>{
    console.log(actor)
    setactorname(actor)
  })
  },[])

  function loadactors(){
    const pagecontent = [];
    actorname.forEach(element => {
      pagecontent.push(<h5>{element.lastname}, {element.firstname}</h5>)
    });
    return(pagecontent)
  }

  //what is displayed is below
  return(
  <>
    <div>
      <div>
        {actorname !== [] ? 
        loadactors() 
        : 
        null}
      </div>
    </div>
  </>
)}

 function  Getactorbyfirstname(){
  //funtionality below:

  const[actorname,setactorname] = useState([])
  const searchbox = useRef()



  function handlechange(){
    let firstname = searchbox.current.value
    fetch("http://localhost:8080/home/allActorswithfirstname/"+firstname)
    .then(res => res.json())
    .then(actor =>{
    console.log(actor)
    setactorname(actor)
    })
  }
 

  function loadsearch(){
    const pagecontent = [];
    actorname.forEach(element => {
      pagecontent.push(<h1>{element.lastname}, {element.firstname}</h1>)
    });
    return(pagecontent)
  }

  //what is displayed is below
  return(
  <>
    <div>
      <div >
        Search:
        <input type="text" ref={searchbox} onChange={handlechange} />
      </div>
      <div>
        {actorname !== [] ? 
        loadsearch() 
        : 
        null}
      </div>
    </div>
  </>
)}

root.render(
  <div>
    <div className="banner">
      <strong>Search for actor by their first name</strong>
    </div>
    <div className="background middlecontainer">

      <div className="box left">
        <Getallactors />
      </div>

      <div className="box hoverable right">
        <Getactorbyfirstname />
      </div>

    </div>
  </div>
,);