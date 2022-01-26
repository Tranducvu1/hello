

#path =r"C:\Users\ADMIN\IdeaProjects\FileTest\chromedriver.exe"
#chrome_options = webdriver.ChromeOptions()
#browser = webdriver.Chrome(executable_path=path, chrome_options=chrome_options)

# khoi tao chrome
#print("start")
#browser.get("https://facebook.com")
#browser.find_element_by_id('email').send_keys("0345934782")
#browser.find_element_by_id('pass').send_keys("034593478221it324")
#browser.find_element_by_name('loginbutton').click()
#tìm kiếm
import driver as driver
from selenium import webdriver
driver = webdriver.Chrome()
print("start")
driver.get("https://facebook.com")
driver.find_element_by_id('email').send_keys("0345934782")
driver.find_element_by_id('pass').send_keys("034593478221it324")
#button = driver.find_element_by_xpath"//*[@id='u_0_d_8s']")
#button = driver.find_element_by_xpath("//button[Log In]")
#button.click()
driver.find_element_by_name('Logginbutton').click()
#driver = webdriver.Firefox()
#print (driver.current_url)
#
#from selenium import webdriver

#driver = webdriver.Chrome()
#driver.set_window_size(1200, 1200)
#driver.get('https://www.youtube.com/')


#time.sleep(2)

# Thực hiện tìm tới cái name input sau đó điền key search vào ô đó
#driver.find_element_by_name("search_query").send_keys("Phi hanh gia")
#driver.find_element_by_id("search-icon-legacy").click()
#time.sleep(2)
#import time

#driver = webdriver.Chrome()
#driver.set_window_size(1200, 1200)
#driver.get('https://elearning.vku.udn.vn/login/')
#driver.find_element(By.CSS_SELECTOR,'#region-main a').click()
#driver.find_element(By.CSS_SELECTOR,'button.dropdown-toggle').click()
#driver.find_element(By.ID,'dropdown-toggle')
#tiki
#driver.get('https://tiki.vn/dien-thoai-may-tinh/c1789')

#WebDriverWait = WebDriverWait(driver,10).until(
 #    es.presence_of_element_located('a.product-item')
#)
#product=driver.find_element(By.CSS_SELECTOR,'[data-view-id=product_list_container] a.product-item')[:2]
#Links = []
#for p in product:
 #    Links.append(p.get.attribute('href'))
#print(p.find_elements(By.CSS_SELECTOR,'name').text)
    # except StaleElementReferenceException:
#pass
#print(Links)

#Tim học phần và lớp rồi đăng kí
#dshp = [
 #    {idhp: 22, idlop: 5071, m: 45}
#]
#function DKTC(idhp,idlop,m){
 #    url = "http://dk3.vku-udn.edu.vn/sv/dang-ky-tung-lophp";
#$.ajax({
    # type: "GET",
   #  url: url,
  #   data: {hocphan_id:idhp, idlop: idlop, m: m},
 #    success: function () {console.log("OK");}
#});
#}

#dshp.forEach(item => {
#     setTimeout(DKTC(item.idhp,item.idlop,item.m),1000);
#});

#def fb_login():
 #    driver = webdriver.Chrome()
  #   driver.get (“https://www.facebook.com”)
#driver.find_element_by_id(“email”).send_keys(‘iin@tech.com’)
#driver.find_element_by_id(“pass”).send_keys(“iin”)
#driver.find_element_by_id(“loginbutton”).click()