public class Pregunta3 {
    public static void main(String[] args) {
        float mc;
        int rubro;
        cout<<"Monto de compra:";cin>>mc;
        cout<<"Rubro:";cin>>rubro;
        if (mc>=0&&mc<=250&&rubro==1 ) {
            mc = mc + 0.15 * mc;
        }
        else if (mc>=251&&mc<=500&&rubro==1 ) {
            mc = 1.15 * 0.95 * mc;
        }
        else if (mc>=501&&mc<=1000&&rubro==1 ) {
            mc = 1.15 * 0.90 * mc;
        }
        else if (mc>=1001&&rubro==1 ) {
            mc = 1.15 * 0.85 * mc;
        }
        else if (mc>=0&&mc<=250&&rubro==2) {
            mc = mc + 0.20 * mc;
        }
        else if (mc>=251&&mc<=500&&rubro==2 ) {
            mc = 0.95 * 1.20 * mc;
        }
        else if (mc>=501&&mc<=1000&&rubro==2 ) {
            mc = 0.90 * 1.20 * mc;
        }
        else if (mc>=1001&&rubro==2 ) {
            mc = 0.85 * 1.20 * mc;
        }
        cout<<"Monto de compra es:"<}
    }
}
