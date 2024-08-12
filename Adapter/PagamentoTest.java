public class PagamentoTest {
    public static void main(String[] args) {
        MPay mpay = new MpayImpl();
        mpay.setCreditCardNo("1234567890123456");
        mpay.setCustomerName("Guilherme");
        mpay.setCardExpMonth("12");
        mpay.setCardExpYear("2025");
        mpay.setCardCVVNo((short) 123);
        mpay.setAmount(250.75);

        PPay ppay = new MPayToPPayAdapter(mpay);

        testPPay(ppay);
    }

    public static void testPPay(PPay pp) {
        System.out.println(pp.getCardOwnerName());
        System.out.println(pp.getCustCardNo());
        System.out.println(pp.getCardExpMonthDate());
        System.out.println(pp.getCVVNo());
        System.out.println(pp.getTotalAmount());
    }
}
