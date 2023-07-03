/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.tienda.service;

/**
 *
 * @author Mayerling
 */
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public interface FirebaseStorageService {

    public String cargaImagen (MultipartFile archivoLocalCliente, String carpeta, Long id);
    //E1 BuketName es el <id_del_proyecto> + .appspot.com/
    final String BucketName = "techshop-2daaf.appspot.com";
    //Esta es la ruta básica de este proyecto 
    final String rutaSuperiorStorage = "tienda";
    //Ubicación donde se encuentra el archivo de configuración Json
    final String rutaJsonFile = "firebase";
    //El nombre del archivo Json
    final String archivoJsonFile = "techshop-2daaf.firebaseapp.com";
}