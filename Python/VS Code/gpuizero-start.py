from guizero import App, Text, TextBox, PushButton, Slider, Picture

def say_my_name():
    welcome_message.value = my_name.value
def change_text_size(slider_value):
    welcome_message.size = slider_value

app = App(title="Hello World!")

welcome_message = Text(app, text="Hi Friends, the Seconding!", font="Times New Roman", size=30, color="ForestGreen")

my_name = TextBox(app)
my_name.width = 50

update_text = PushButton(app, text="Update", command=say_my_name)

text_size = Slider(app, start=10, end=80, command=change_text_size)

my_cat = Picture(app, image="cat.png", height=1000, width=800)

app.display()

