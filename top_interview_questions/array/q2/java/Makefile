# Имя целевого файла
MAIN = Main
BUILD_DIR = build

# Цель по умолчанию
default: run

# Удаление папки с байт-кодом
clean:
	@rm -rf $(BUILD_DIR)

# Компиляция программы
build: clean
	@mkdir -p $(BUILD_DIR)
	@javac -d $(BUILD_DIR) $(MAIN).java

# Запуск программы
run: build
	@java -cp $(BUILD_DIR) $(MAIN)
