package com.qrlogin.at.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/qrcode")

public class QrCodeController {
        
        @RequestMapping("/generate")
        public String generateQrCode() {
            return "QrCode";
        }
        

    
    
}
