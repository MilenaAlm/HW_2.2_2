public class ServiceStation implements ServiceStationInt {

    @Override
    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }

    @Override
    public void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }
    @Override
    public void updateTyre() {
        System.out.println("Меняем покрышку");
    }

    public void check(Transport transport) {
        if (transport != null) {
            System.out.println("Обслуживаем " + transport.getModelName());
            for (int i = 0; i < transport.getWheelsCount(); i++) {
                updateTyre();
            }
        }
            if (transport.getWheelsCount() > 2){
                checkEngine();
                checkTrailer();
            }

        }
    }