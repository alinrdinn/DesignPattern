/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AdapterPattern;

/**
 *
 * @author Ali Nurdin
 */
public class WebAdapter implements Requester {

    private LayananWeb layanan;

    public void Hubungkan(LayananWeb currentService) {
        this.layanan = currentService;
    }

    public int Minta(Object request) {
        Json result = this.toJson(request);
        Json response = layanan.request(result);
        if (response != null) {
            return 200; // OK
        }
        return 404; // error
    }

    private Json toJson(Object input) {
        
        // Ceritanya, method ini mengonversi objek ke Json
        System.out.println("Mengkonversi Input ke Json...");
        return new Json();
    
    }
}
