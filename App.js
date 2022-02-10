import React from "react";
import Header from "./component/Header";
import LoginForm from "./component/LoginForm";
import 'bootstrap/dist/css/bootstrap.min.css';
import Footer from "./component/Footer";
import AddCustomer from "./component/AddCustomer";
import AddProduct from "./component/AddProduct";

import "./App.css"
import {BrowserRouter as Router,Route,Switch}from 'react-router-dom';

export default function App() {
  return (
    <h1>Tushar Jagtap</h1>
      <Router>
      <Header/>
    
        <div className="container">
               <Switch>
               <Route path="/" exact component={LoginForm}></Route>
                <Route path="/AddCustomer" component={AddCustomer}></Route>
                <Route path="/AddProduct" component={AddProduct}></Route> 
               </Switch>
        </div>
        <Footer/>
       
      </Router>   
        
  );
}

