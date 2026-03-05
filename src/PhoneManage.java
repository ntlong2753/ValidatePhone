public class PhoneManage {
    private static final String PHONE_VIETTEL = "^(0|84|\\\\+84)(3[2-9]|9[6-8]|86)+[0-9]{7}$";
    private static final String PHONE_VINAPHONE = "^0(9[14]|8[1-58])[0-9]{7}$";
    private static final String PHONE_MOBIFONE = "^(07[06-9])[0-9]{7}$";
    private static final String EMAIL_REGEX = "^[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)$";

    public static boolean checkPhone(String phone) {
            if (phone == null || phone.trim().isEmpty()) {
                return false;
            }
            return phone.matches(PHONE_VIETTEL) ||
                phone.matches(PHONE_VINAPHONE) ||
                phone.matches(PHONE_MOBIFONE);
    }
}
