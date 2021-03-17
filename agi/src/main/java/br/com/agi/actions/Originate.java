//package br.com.agi.actions;
//
//import br.com.agi.configuracoes.ConfigGeneral;
//import br.com.agi.configuracoes.ConfigsAsterisk;
//import org.asteriskjava.manager.TimeoutException;
//import org.asteriskjava.manager.action.OriginateAction;
//import org.asteriskjava.manager.response.ManagerResponse;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
//
//import java.io.IOException;
//
//
//@Component
//public class Originate {
//
//    @Autowired
//    private ConfigsAsterisk configsAsterisk;
//
//    @Autowired
//    private ConfigGeneral configGeneral;
//
//    public ManagerResponse run(Chamadas chamada) {
//        System.out.println("INICIANDO LIGAÇÃO");
////        configsAsterisk.login();
//
//        String tecnologia = "SIP";
//        //String linhaAtiva = Clientes.LINHA1.getLinha();
//        String prefixoPais = configGeneral.getPrefixoPais();
//        String DDD = chamada.getPrefixo();
//        String numeroParam = chamada.getNumero();
//
//        String numero = prefixoPais + DDD + numeroParam;
////        String ligar = tecnologia + "/" + linhaAtiva + "/" + numero;
//
//        OriginateAction originateAction = new OriginateAction();
////        originateAction.setChannel(ligar);
//        originateAction.setExten(chamada.getExtensao());
////        originateAction.setContext(chamada.getContexto().getNome());
//        originateAction.setPriority(1);
//        originateAction.setAsync(true);
//        originateAction.setTimeout(30000L);
//        originateAction.setCallerId(chamada.getCallerId());
//
//        ManagerResponse managerResponse = null;
//        try {
//            managerResponse = configsAsterisk.getManagerConection().sendAction(originateAction, 30000L);
//        } catch (IOException e) {
//            e.printStackTrace();
//        } catch (TimeoutException e) {
//            e.printStackTrace();
//        }
//
////        configsAsterisk.logoff();
//        return managerResponse;
//    }
//}