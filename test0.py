

from flask import Flask, render_template, request, redirect, url_for, abort

app = Flask(__name__, template_folder='.') # Use current directory for templates

# # In-memory product store
products = [
    {
        'id': 1,
        'name': 'Laptop Pro',
        'price': '1200',
        'details': 'A high-performance laptop for professionals.',
        'picture': 'https://via.placeholder.com/300'
    },
    {
        'id': 2,
        'name': 'Wireless Headphones',
        'price': '250',
        'details': 'Noise-canceling over-ear headphones.',
        'picture': 'https://via.placeholder.com/300'
    }
] 

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
    if product is None:
        abort(404)
    return render_template('detail.html', product=product)

@app.errorhandler(404)
def page_not_found(e):
    return render_template('404.html'), 404

if __name__ == '__main__':
    app.run(debug=True, port=5000)
