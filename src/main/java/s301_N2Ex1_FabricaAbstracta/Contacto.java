package s301_N2Ex1_FabricaAbstracta;

public class Contacto {
    private Object contacto;
    private String nombre;
        private String telefono;
        private String direccion;

        public Contacto(String nombre, String telefono, String direccion) {
            this.contacto = "España";
            this.nombre = nombre;
            this.telefono = telefono;
            this.direccion = direccion;
        }

        // Getters
        public String getNombre() {
            return nombre;
        }
        public String getTelefono() {
            return telefono;
        }
        public String getDireccion() {
            return direccion;
        }
        //setters
        public void setNombre(String nombre) {
            this.nombre = nombre;
        }
        public void setDireccion(String direccion) {
            this.direccion = direccion;
        }
        public void setTelefono(String telefono) {
            this.telefono = telefono;
        }

}


