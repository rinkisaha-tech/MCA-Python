# 1) create a file data.txt and copy its contet into backup.txt.

# import shutil

# content = "name = abc, roll = 002, dept= css"

# with open('data.txt', 'w') as file:
#     file.write(content)

# shutil.copyfile('data.txt','backup.txt')
# print("data is copied from data.txt to backup.txt")



# 2) Rename backup.txt to data_backup.txt.

import os

# os.rename('backup.txt', 'data_backup.txt')

# 3) Create a directory called logs, and inside it:
    # a) Create a file log1.txt  b) Write log entrirs into it.

os.mkdir('logs')
print("directory created successfully.")
with open('log1.txt','w') as log_file:
    log_file.write("This is the first line written into it.")


# 4) Delete log1.txt and remove the logs directory.
# os.remove('log1.txt')
# os.rmdir('logs')
