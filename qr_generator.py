import qrcode

def generate_qr_code(data, filename):
    qr = qrcode.QRCode(
        version=1,
        error_correction=qrcode.constants.ERROR_CORRECT_L,
        box_size=10,
        border=4,
    )
    qr.add_data(data)
    qr.make(fit=True)

    img = qr.make_image(fill_color="black", back_color="white")
    img.save(filename)

if __name__ == "__main__":
    text_to_encode = input("Wprowadź tekst do zakodowania: ")
    output_filename = input("Podaj nazwę pliku wyjściowego (z rozszerzeniem .png): ")

    generate_qr_code(text_to_encode, output_filename)
    print("Kod QR został wygenerowany pomyślnie!")
