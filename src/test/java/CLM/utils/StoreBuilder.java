package CLM.utils;

import org.junit.jupiter.api.Test;

public class StoreBuilder {
    public static void main(String[] args) {
        String loginS = " ";
        String passS = "";
    }

    public String buildDEV() {
        System.out.println("Helo");
        //перейти на сайт http://tkles-efs000545.vm.esrt.cloud.sbrf.ru:8443/ui/index.html#/home
        //залогиниться под своей учёткой Sigma
        //убедиться, что мы на странице сборки нужного пайма (проверить название)
        //получить имя последнего успешного билда
        //нажать "Собрать с параметрами"
        //получить верхнее в списке имя билда
        //проверить, не равно ли оно версии последнего успешного билда
        //если не равно - продолжаем
        //если равно - возвращаем ошибку в лог
        //нажать "Собрать"
        //убедиться, что сборка запущена
        //подождать пока билд соберётся
        //проверить статус сборки при её завершении
        //сообщить о статусе текстовым сообщением на экране

        //при успехе вернуть имя билда
        //иначе вернуть сообщение об ошибке в лог
        String devBuildName = "ж";
        System.out.println("Hello");

        return devBuildName;
    }
}


