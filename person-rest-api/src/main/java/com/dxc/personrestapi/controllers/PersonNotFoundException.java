package com.dxc.personrestapi.controllers;

public class PersonNotFoundException extends RuntimeException
 {
     PersonNotFoundException(Integer id){
         super("could not find person"+id);
     }
    
}
