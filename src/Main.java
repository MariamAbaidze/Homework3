//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    String[] names = {"Tamari", "Mari", "Lizi", "Sofia", "Ani", "lika"};
    for (int i = 0; i < names.length; i++) {
        if (i == 4) {
            continue;
        }
        System.out.println(names[i]);
    }
}
