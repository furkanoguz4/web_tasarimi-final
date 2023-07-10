package com.hamitmizrak.finalhome.webprogramming;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.io.Serializable;
import java.util.Date;

//Lombok
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
//DTO ==> validation
public class JqueryDto implements Serializable {

    //serileştirme
    public static final long serialVersionUID = 1L;

    // ID
    private Long id;

    // İSİM
    @NotNull(message = "isim yazmadınız")
    private String isim;

    // EMAIL
    @NotNull(message = "email addres yazmadınız")
    private String email;

    // PASSWORD
    @NotNull(message = "şifreyi girmediniz")
    private String passwd;

    // PASSWORD CONFIRM
    @NotNull(message = "şifre tekrarını girmediniz")
    private String passwdConfirm;

    // Sistem tarihi almak
    private Date createdDate;
}
