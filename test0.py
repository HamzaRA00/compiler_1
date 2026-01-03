from flask import Flask, render_template, request, redirect, url_for #done

app = Flask(__name__) #done

# # In-memory product store
products = [] # done

@app.route('/') #done
def index():
    return render_template('index.html', products=products)

@app.route('/add', methods=['GET', 'POST']) #done
def add_product():
    if request.method == 'POST':
        product = {
            'id': len(products) + 1,
            'name': request.form['name'],
            'price': request.form['price'],
            'details': request.form['details'],
            'picture': request.form['picture']  # URL to image
        }
        products.append(product)
        return redirect(url_for('index'))
    return render_template('add.html')

@app.route('/product/<int:product_id>')
def product_detail(product_id):
    product = next((p for p in products if p['id'] == product_id), None)
    return render_template('detail.html', product=product)

if __name__ == '__main__':
    app.run(debug=True)
