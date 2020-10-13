import pyautogui
import time

#print(pyautogui.position())

# Öffnen des Textfeldes
pyautogui.click(96,49)

# Ändern des Texts
pyautogui.click(56,42)
pyautogui.hotkey("ctrl","a")
pyautogui.hotkey("delete")
pyautogui.write("Paigo")

time.sleep(0.5)

# Schließen
pyautogui.click(90,72)

#Öffnen jList
pyautogui.click(130,49)
time.sleep(1)
pyautogui.click(60,72)
time.sleep(0.8)
pyautogui.click(90,70)
time.sleep(2)

# Öffnen der jComboBox
pyautogui.click(240,49)
time.sleep(1)
pyautogui.click(98,48)
time.sleep(1)
pyautogui.click(40,176)
pyautogui.click(131,53)
time.sleep(2)

# Öffnen des Menues
pyautogui.click(352,49)
pyautogui.click(67,22)
time.sleep(2)
pyautogui.click(38,31)
time.sleep(1)
pyautogui.click(8,50)
time.sleep(2)
pyautogui.click(702,65)



