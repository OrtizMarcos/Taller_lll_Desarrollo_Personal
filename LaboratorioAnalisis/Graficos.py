import matplotlib.pyplot as plt

# Datos para el algoritmo Secuencial
secuencial_sizes = [1000, 10000, 100000]
secuencial_empirical_times = [6701000, 86711900, 5744767300]
secuencial_estimated_times = [1024, 16384, 131072]

# Datos para el algoritmo Binaria
binaria_sizes = [1000, 10000, 100000, 1000000]
binaria_empirical_times = [652400, 3932100, 15462700, 275134300]
binaria_estimated_times = [1024, 16384, 131072, 1048576]

# Crear los gráficos
plt.figure(figsize=(12, 6))

# Gráfico para el algoritmo Secuencial
plt.subplot(1, 2, 1)
plt.plot(secuencial_sizes, secuencial_empirical_times, marker='o', label='Tiempo empírico')
plt.plot(secuencial_sizes, secuencial_estimated_times, linestyle='--', label='Tiempo estimado')
plt.xlabel('Tamaño del vector (N)')
plt.ylabel('Tiempo de ejecución')
plt.title('Algoritmo Secuencial')
plt.legend()
plt.grid(True)

# Gráfico para el algoritmo Binaria
plt.subplot(1, 2, 2)
plt.plot(binaria_sizes, binaria_empirical_times, marker='o', label='Tiempo empírico')
plt.plot(binaria_sizes, binaria_estimated_times, linestyle='--', label='Tiempo estimado')
plt.xlabel('Tamaño del vector (N)')
plt.ylabel('Tiempo de ejecución')
plt.title('Algoritmo Binario')
plt.legend()
plt.grid(True)

plt.tight_layout()
plt.show()
